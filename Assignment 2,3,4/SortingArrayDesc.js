function sortDescending(arr) {
    var len = arr.length;
  
    for (let i = 0; i < len - 1; i++) {
      for (let j = 0; j < len - 1 - i; j++) {
        if (arr[j] < arr[j + 1]) {
          let temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }
  }
  
  const exampleArray = [5, 2, 9, 1, 5, 6];
  sortDescending(exampleArray);
  console.log(exampleArray); 
  