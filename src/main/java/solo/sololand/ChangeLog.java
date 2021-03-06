package solo.sololand;

public class ChangeLog{
	
	private ChangeLog(){
		
	}
	
}
	

/*

   
   _____  ____  _      ____  _                     _    
  / ____|/ __ \| |    / __ \| |                   | |   
 | (___ | |  | | |   | |  | | |     __ _ _ __   __| |   
  \___ \| |  | | |   | |  | | |    / _` | '_ \ / _` |   
  ____) | |__| | |___| |__| | |___| (_| | | | | (_| |   
 |_____/ \____/|______\____/|______\__,_|_| |_|\__,_|   
   _____ _                            _                 
  / ____| |                          | |                
 | |    | |__   __ _ _ __   __ _  ___| |     ___   __ _ 
 | |    | '_ \ / _` | '_ \ / _` |/ _ \ |    / _ \ / _` |
 | |____| | | | (_| | | | | (_| |  __/ |___| (_) | (_| |
  \_____|_| |_|\__,_|_| |_|\__, |\___|______\___/ \__, |
                            __/ |                  __/ |
                           |___/                  |___/ 





==================================
INTRO
==================================

[ SOLOLand ]
* 누킷을 위한 월드, 땅, 섬 관리 플러그인 입니다.

http://blog.naver.com/solo_5 에서 최신 버전을 다운로드 받을 수 있습니다.





==================================
CHANGELOG
==================================

0.0.1
- 첫 빌드

0.0.2
- 섬에 잔디, 나무 추가
- /땅 정보 > 땅 크기 추가
- 자동 저장 추가

0.0.3
- 자동 저장 문제 해결
- 땅 크기가 잘못 표시되는 문제 해결

0.0.4
- 섬 삭제(/땅 삭제)시 데이터는 보존하되 땅 정보를 비우도록 수정

0.0.5
- /땅 정보 입력시 최대한 간결하게 표시하도록 수정

0.0.6
- 섬 스폰이 잘못 설정되던 점 수정

0.0.7
- 섬 제너레이터 수정
- /섬 시작 명령어 권한 수정

0.1.0
- 월드 커스텀 이름 추가
- /월드 이름변경 [바꿀 이름] 명령어 추가
- 커스텀 이름 추가에 맞춰, 많은 파일을 수정
- /땅 목록 입력 시 모든 월드에 소유한 땅 표시

0.1.1
- 오피는 돈이 없어도 땅 생성 가능하도록 변경

0.2.0
- 코드 업데이트
- /땅 확장 추가
- 다른 사람이 내 땅 방문 시 주인에게 알림 idea by EVE
- /땅 방문자 - 현재 땅에 사람 목록 idea by 히륜
- 패키지 경로 수정
- 땅에서 나갈 시 팝업으로 표시
- 환영파티클 용암, 불 추가
- 출입금지 상태에서 접근 시 파티클 도배 되는 점 수정하기
- 월드 불번짐 옵션 추가 (/월드 불번짐허용) [Bug:작동안함]

1.0.0
- 대규모 업데이트!
- 커맨드 퍼미션 추가
- 평야 추가 (GridLand)
- 텅 빈 월드 제너레이터 추가 (EmptyWorld)
- 스카이블럭 제너레이터 추가 (SkyBlock)
- 스카이그리드 제너레이터 추가 (SkyGrid)
- /땅 공유목록 명령어 추가
- /월드 생성 [이름] <제너레이터> 명령어 추가
- /월드 목록 명령어 추가
- /월드 이동 [이름] 명령어 추가
- /월드 설정정보 명령어 추가
- /월드 유저정보 명령어 추가
- /월드 땅정보 명령어 추가
- 커맨드 구조 변경
- 데이터 저장 구조 변경
- 일부 명령어 삭제
- ... 그 외에 더 많은 것들 !

1.0.1
- 0.16.0 커맨드 오류 수정

2.0.0
- 방 기능 추가!
- 더 멋진 메세지 디자인!
- 땅이나 방 편집시, 가장자리를 파티클로 표시하는 기능 추가!
- /땅 확장, /땅 축소 명령어 추가! 자유롭게 땅 크기를 변경해보세요
- /땅 나가기 명령어 추가
- /월드 명령어사용 명령어 추가
- /월드 스폰 명령어 추가
﻿- setting.yml 추가 (디버그 on/off 등)
- 땅이나 방이 매물에 등록되어있는 동안엔 주인이나 공유받은 유저들이 땅을 수정할 수 없도록 변경
- 평야 월드 마이너스 좌표엔 블럭을 생성하지 않도록 변경
- 평야 월드 땅이 31x31로 생성되던 버그 수정, 이제 32x32로 생성됩니다.
- 환영말 표시 방식 약간 수정
- 매물 목록에 환영말 표시
- 많은 코드 수정 또는 추가(4600줄 -> 7200줄), 그와 동시에 많은 잠재적인 버그 수정
- 마이너스 좌표에서 좌표가 잘못 계산되던 버그 수정
- 그 외에도, 정말로 많은 버그 수정!
- ...그 외에 더 많은 것들! (기억안남)

2.0.1
- 평야 땅이 잘못된 위치에 생성되던 버그 수정

2.0.2
- /월드 땅크기변경허용 명령어 추가
- 누킷에 내장된 지옥 제너레이터도 /월드 생성 명령어로 생성 가능

2.0.3
- 섬 스폰이 잘못 설정되던 버그 수정
- 여러 사소한 버그 수정

2.0.4
- 섬 스폰이 잘못 설정되던 버그 수정

2.1.0
- 땅에서 pvp가 금지이더라도 월드가 pvp허용 상태면 pvp가 되던 버그 수정
- 평야에서 땅이 같은자리에 2개 이상 생성되던 버그 수정
- /땅 정보 명령어에 더 많은 정보를 표시하도록 수정
- /땅 문허용 명령어 추가
- /땅 상자허용 명령어 추가
- /월드 문허용 명령어 추가
- /월드 상자허용 명령어 추가
- /땅 합치기 명령어 추가
- /월드 땅합치기허용 명령어 추가

2.2.0
- SOLOBasePackage와 연동
- 땅에서 pvp를 허용하더라도 월드가 pvp를 허용하지 않으면 pvp가 안되던 버그 수정
- 땅 출입금지 상태에서도 출입이 되던 버그 수정

2.3.0
- 알림 기능 추가 (SOLONotification 플러그인 필요)
- SOLOBasePackage 0.3.0 이상 필요
- Gridland preset 기능 추가. 이제 평야를 원하는 대로 커스텀할 수 있습니다.

TODO:
- 영어 지원
- /월드 방정보 명령어 추가


*/