// function Arrays() {
//     let data = [
//         { name: 'Alok', city: 'Noida', email: 'alok123@gmail.com' },
//         { name: 'Suresh', city: 'Delhi', email: 'suresh321@gmail.com' },
//     ]

//     return (
//         <div>
//             <h2>Data coming from an Array:</h2>
//             {
//                 data.map((element) =>
//                     <h3>
//                         Name: {element.name}, City: {element.city}, Email: {element.email}
//                     </h3>
//                 )
//             }
//         </div>
//     )
// }

// export default Arrays


function Arrays() {
    let data = [
        { name: 'Alok', city: 'Noida', email: 'alok123@gmail.com' },
        { name: 'Suresh', city: 'Delhi', email: 'suresh321@gmail.com' },
    ];

    return (
        <div>
            <h2>Data Coming from an Array:</h2>

            <table border="1" cellPadding="10">
                <thead>
                    <tr>
                        <th>Name</th>
                        <th>City</th>
                        <th>Email</th>
                    </tr>
                </thead>

                <tbody>
                    {data.map((element, index) =>
                        <tr key={index}>
                            <td>{element.name}</td>
                            <td>{element.city}</td>
                            <td>{element.email}</td>
                        </tr>
                    )}
                </tbody>
            </table>
        </div>
    );
}

export default Arrays;