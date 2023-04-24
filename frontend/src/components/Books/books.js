import React from "react";

const books = (props) => {
    return (
        <div>
            <div>
                <div>
                    <table className={"table table-hover table-bordered"}>
                        <thead className={"table-info"}>
                            <tr>
                                <th scope={"col"}>Name</th>
                                <th scope={"col"}>Author</th>
                                <th scope={"col"}>Available copies</th>
                                <th scope={"col"}>Category</th>
                                <th scope={"col"}>Delete</th>
                                <th scope={"col"}>Edit</th>
                            </tr>
                        </thead>
                        <tbody>
                        {props.books.map((term)=>{
                            return (
                                <tr>
                                    <td>{term.name}</td>
                                    <td>{term.author.name} {term.author.surname}</td>
                                    <td>{term.availableCopies}</td>
                                    <td>{term.category}</td>
                                    <td>Delete</td>
                                    <td>Edit</td>
                                </tr>
                            );
                        })}
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
    );
}

export default books;