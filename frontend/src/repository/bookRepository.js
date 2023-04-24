import axios from '../custom-axios/axios'

const bookService = {
    fetchBooks: () => {
        return axios.get("/books")
    }
}

export default bookService;