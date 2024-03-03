import { Component } from '@angular/core';
import { Player } from '../Model/player';
import { PlayerService } from '../service/player.service';

@Component({
  selector: 'app-getbyrole',
  templateUrl: './getbyrole.component.html',
  styleUrls: ['./getbyrole.component.css']
})
export class GetbyroleComponent {

  playerList:Player[]=[];
  role:string='Batsman';

  constructor(private playerService:PlayerService) { }

  ngOnInit(): void {
    this.getPlayerByRole(this.role)
  }

  getPlayerByRole(role:string){
   this.playerService.getByRole(role).subscribe((data)=>{
     this.playerList=data;
     console.log(this.playerList);
   })
  }



}
