
var controlFunction = setInterval(restart, 120000);

function restart() {
    document.getElementById("img").src = 'Img\\CFG 19 Leisure00001.png';
    document.getElementById("img2").src = 'Img\\CFG19 Emergency00101.jpg';
}


    function changeImage(element) {
        console.log();
        var str = element.src;
        var lastFive = str.substr(str.length - 9);
        console.log(lastFive);

        // The personal
        if (lastFive === '00001.png') {
            var audio = new Audio('Audio/barking.mp3');
            audio.play();
            document.body.style.backgroundColor = "blue";
            document.getElementById("img").src = 'Img\\CFG 19 Outside 00011.jpg';
            document.getElementById("img2").src = 'Img\\CFG Inside 00100.jpg';
        }

        // Immediate - Now
        else if (lastFive === '00101.jpg') {
            var audio = new Audio('Audio/Emergency.mp3');
            audio.play();
            document.body.style.backgroundColor = "yellow";
            console.log('in else if')
            document.getElementById("img").src = 'Img\\CFG 19 Emergency 00010.png';
            document.getElementById("img2").src = 'Img\\CFG 19 Imminent 00110.jpg';

        }


        // Outside
        else if (lastFive === '00011.jpg') {

            var audio = new Audio('Audio/birds.mp3');
            audio.play();

            document.getElementById("img").src = 'Img\\CFG 19 Play 00111.jpg';
            document.getElementById("img2").src = 'Img\\CFG 19 Restroom 01000.jpg';
        }

        // Inside
        else if (lastFive === '00100.jpg') {
            var audio = new Audio('Audio/door.mp3');
            audio.play();

            document.getElementById("img").src = 'Img\\CFG 19 Food& Water 01001.jpg';
            document.getElementById("img2").src = 'Img\\CFG 19 Sleep 01010.jpg';
        }

        // Emergency (1st level)
        else if (lastFive === '00010.png') {
            var audio = new Audio('Audio/siren.mp3');
            audio.play();

            document.getElementById("img").src = 'Img\\CFG 19 Siren 01011.png';
            document.getElementById("img2").src = 'Img\\CFG 19 911 01100.png';
        }

        // Imminent (2nd lvl)
        else if (lastFive === '00110.jpg') {
            var audio = new Audio('Audio/clock.mp3');
            audio.play();

            document.getElementById("img").src = 'Img\\CFG 19 Alarm 01101.jpg';
            document.getElementById("img2").src = 'Img\\CFG Message01110.png';
        }

        else if (lastFive === '00111.jpg') {
            var audio = new Audio('Audio/ballhit.mp3');
            audio.play();

            alert("The dog wants to go play!")
        }

        else if (lastFive === '01000.jpg') {
            var audio = new Audio('Audio/toiletflushing.mp3');
            audio.play();

            alert("The dog wants to go potty!")
        }

        else if (lastFive === '01001.jpg') {
            var audio = new Audio('Audio/eatingChips.mp3');
            audio.play();

            alert("The dog wants to eat!")
        }

        else if (lastFive === '01010.jpg') {
            var audio = new Audio('Audio/snoring.mp3');
            audio.play();

            alert("The dog wants to rest!");
        }


        // Call
        else if (lastFive === '01100.png') {
            var audio = new Audio('Audio/help.mp3');
            audio.play();
            window.location.href = "tel:8328186539"
        }

        // Alarm 
        else if (lastFive === '01101.jpg') {
            alert("IN DANGER. ACT SOON")
        }

        //Email
        else if (lastFive === '01110.png') {
            alert("IN DANGER. ACT SOON. EMAILING WIFEY");
            window.open('mailto:pradofernando2015@gmail.com?subject=High Priority!!! OPEN ASAP!&body=Come help team 1 get first place in the hackathon.');
        }
    }


