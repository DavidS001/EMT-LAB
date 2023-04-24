
import './App.css';
import {Component} from "react";
import React from "react";
import Books from "../Books/books";
import bookService from "../../repository/bookRepository";



class App extends Component {

    constructor(props) {
        super(props);
        this.state = {
            books:[]
        }
    }
    render() {
        return (
            <div>
                <Books books={this.state.books}/>
            </div>
        );
    }

    loadBooks = () => {
        bookService.fetchBooks()
            .then((data)=>{
                this.setState({
                   books: data.data
                })
            });
    }
    componentDidMount() {
        this.loadBooks();
    }
}

export default App;
