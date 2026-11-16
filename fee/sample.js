function Arrays() {
    let data = [
        { name: 'Alok', city: 'Noida', email: 'alok123@gmail.com' },
        { name: 'Suresh', city: 'Delhi', email: 'suresh321@gmail.com' },
    ]

    return (
        <div>
            <h2>Data coming from an Array:</h2>
            {
                data.map((element) =>
                    <h3>
                        Name: {element.name}, City: {element.city}, Email: {element.email}
                    </h3>
                )
            }
        </div>
    )
}

export default Arrays