package main
import "fmt"
func main() {
	m := make(map[string]int)
	m["Tien"] = 7
	m["Vu Quang"] = 0
	fmt.Println("map:",m)
	value := m["Tien"]

}
