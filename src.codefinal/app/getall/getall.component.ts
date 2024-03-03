import { Component } from '@angular/core';
import { Player } from '../Model/player';
import { PlayerService } from '../service/player.service';

@Component({
  selector: 'app-getall',
  templateUrl: './getall.component.html',
  styleUrls: ['./getall.component.css']
})
export class GetallComponent {

  playerList: Player[] =[];

  constructor(private playerService: PlayerService){}

  ngOnInit(){
    this.getAllPlayers();
  }

  getAllPlayers(){
    this.playerService.getAll().subscribe((list)=>{
      this.playerList = list;
      console.log(list);
    })
  }


}
