from joints import run_query

run_query(
    """
    SELECT s.studentid, s.studentname, d.deptname
    FROM students s
    LEFT JOIN departments d
        ON s.deptid = d.deptid
    ORDER BY s.studentid
    """
)