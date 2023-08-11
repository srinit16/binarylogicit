
const input = document.getElementById("eid");
const log = document.getElementById("values");
//input.addEventListener("onkeyup", updateValue);

function updateValue(e) {
  log.innerText = input.value;
}