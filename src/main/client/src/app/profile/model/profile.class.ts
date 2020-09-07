export class Profile {
  id: string;
  fullName: string;
  phone: string;
  email: string;
  city: string;
  country: string;
  birthDay: string;
  hobbies: ProfileHobby[];
  education: ProfileEducation[];
  skills: ProfileSkill[];

  constructor(
    id: string,
    fullName: string,
    phone: string,
    email: string,
    city: string,
    country: string,
    birthDay: string,
    hobbies: ProfileHobby[],
    education: ProfileEducation[],
    skills: ProfileSkill[]
  ) {
    this.id = id;
    this.fullName = fullName;
    this.phone = phone;
    this.email = email;
    this.city = city;
    this.country = country;
    this.birthDay = birthDay;
    this.hobbies = hobbies;
    this.education = education;
    this.skills = skills;
  }

  static create(): Profile {
    return new Profile('', '', '', '', '', '', '', [], [], []);
  }
}

export interface ProfileHobby {
  name: string;
}

export interface ProfileEducation {
  beginYear: number;
  finishYear: number;
  institution: string;
  specialization: string;
}

export interface ProfileSkill {
  category: string;
  value: string;
}
