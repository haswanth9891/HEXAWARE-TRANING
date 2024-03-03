import { Component } from '@angular/core';
import { Player } from '../Model/player';
import { PlayerService } from '../service/player.service';

@Component({
  selector: 'app-getbyname',
  templateUrl: './getbyname.component.html',
  styleUrls: ['./getbyname.component.css']
})
export class GetbynameComponent {

  playerList:any[]=[];
  teamName:string='';

  constructor(private playerService:PlayerService) { }

  ngOnInit(): void {
  }

  getPlayerByName(name:string){
    this.playerService.getByteamname(name).subscribe((data:any)=>{
      this.playerList = data;
      console.log(this.playerList);
    })
  }

  getPlayer(teamName: string){
    console.log(teamName)
    this.getPlayerByName(teamName);
  }
}
