import axios from '../custom-axios/axios'

const bookService = {
    fetchBooks: () => {
        return axios.get("/books")
    },

    fetchCategories: () => {
        return axios.get("/categories")
    }
}

export default bookService;