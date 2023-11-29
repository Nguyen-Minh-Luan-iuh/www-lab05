const SKILL_LEVEL = [
    "MASTER",
    "BEGINNER",
    "ADVANCED",
    "PROFESSIONAL",
    "INTERMEDIATE"
]

async function fetchData(){
    try {
        const response = await fetch("http://localhost:8080/api/v1/skills");
        const data = await response.json();
        return data;
    }
    catch (error){
        console.error(error)
    }
}


async function addSkill(){
    const allDivSkill = document.querySelectorAll("[id^='divSkill']")
    const divSkillCount = allDivSkill.length
    const SKILLS = await fetchData()
    const htmlSkill = `
                <div class="form-inline pb-2 border-bottom border-4" id="divSkill${divSkillCount}">
                                            <input type="hidden" name="skillId" value="0"/>
                                            <div class="row">
                                                <div class="col-md-6">
                                                    <label>Skill level:</label>
                                                    <select class="form-select" name="skills">
                                                       ${SKILLS.map(item => {
        return `<option value="${item.id}">${item.skillName}</option>`
    }).join("")}
                                                    </select>
                                                </div>
                                                <div class="col-md-6">
                                                    <label>Skill level:</label>
                                                    <select class="form-select" name="skillLevel">
                                                       ${SKILL_LEVEL.map(item => {
        return `<option value="${item}">${item.toLowerCase()}</option>`
    }).join("")}
                                                    </select>
                                                </div>
                                            </div>
                                        </div>
    `

    document.querySelector('#skillContainer').insertAdjacentHTML("beforeend", htmlSkill);
}