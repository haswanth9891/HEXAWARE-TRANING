import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Player } from '../Model/player';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class PlayerService {

  players: Player[] = [];
  constructor( private http:HttpClient ) { }

  baseURL:string = 'http://localhost:8081/api/players/';

  getByteamname(teamName:string): Observable<any[]>{
    return this.http.get<any[]>(this.baseURL+`get-players-by-teamname/${teamName}`);
  }

  getAll():Observable<Player[]>{

    return this.http.get<Player[]>(this.baseURL+"getall");
}

getByRole(role:string):Observable<Player[]>{
  return this.http.get<Player[]>(this.baseURL+`get/${role}`);
}




}
