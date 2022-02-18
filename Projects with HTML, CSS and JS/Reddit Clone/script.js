function upvote()
{
    let votes = document.getElementById('votes');
    let count = parseInt(votes.innerHTML); // "1000" -> 1000
    count++; // 1000 -> 1001
    votes.innerHTML = count;   
}

function downvote()
{
    let votes = document.getElementById('votes');
    let count = parseInt(votes.innerHTML); // "1000" -> 1000
    count--; // 1000 -> 999
    votes.innerHTML = count;   
}

