import './App.css';
import {Component} from "react";
import React from "react";
import Books from "../Books/books";
import bookService from "../../repository/bookRepository";
import {BrowserRouter, Route, Routes} from "react-router-dom";
import Categories from "../Categories/categories";
import Header from "../Header/header";


class App extends Component {

    constructor(props) {
        super(props);
        this.state = {
            books: [],
            categories: []
        }
    }

    render() {
        return (
            <BrowserRouter>
                <Header/>
                <Routes>
                        <Route path={"/books"} element={<Books books={this.state.books}/>}/>
                        <Route path={"/categories"} element={<Categories categories={this.state.categories}/>}/>
                </Routes>
            </BrowserRouter>
        );
    }

    loadBooks = () => {
        bookService.fetchBooks()
            .then((data) => {
                this.setState({
                    books: data.data
                })
            });
    }

    loadCategories = () => {
        bookService.fetchBooks()
            .then((data) => {
                this.setState({
                    categories: data.data
                })
            });
    }

    componentDidMount() {
        this.loadBooks();
        this.loadCategories();
    }
}

export default App;
