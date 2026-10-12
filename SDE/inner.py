from joints import run_query

# run_query(
#         """
#         SELECT s.studentid, s.studentname, d.deptname
#         FROM students s
#         INNER JOIN departments d
#             ON s.deptid = d.deptid
#         order by s.studentid
#         """
#         )
