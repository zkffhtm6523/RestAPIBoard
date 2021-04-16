package com.mini2S.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@NoArgsConstructor(access = AccessLevel.PUBLIC)
@Getter
@Setter
@Entity
public class Branch extends BaseTimeEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "BRANCH_ID")
    private Long branchId;

    @Column(columnDefinition = "varchar(50) not null unique comment '지점명")
    private String branchName;
    /*
SEQ	PK	FK	컬럼설명	컬럼명	    데이터타입	길이	NULL	기본값	참조	설명
1	O		지점ID	BRANCH_ID	VARCHAR	    100	X
2			지점명	BRANCH_NAME	VARCHAR	    100	X
3			지점코드	BRANCH_CODE	VARCHAR	    100	X
4			우편번호	ZIPCODE	    VARCHAR	    16
5			주소	    ADDRESS1	VARCHAR	    255
6			상세주소	ADDRESS2	VARCHAR	    255
7			좌표x	COORD_X	    DECIMAL	    20,10
8			좌표y	COORD_Y	    DECIMAL	    20,10
9			전화번호	PHONE	    VARCHAR	    100
10			팩스번호	FAX	        VARCHAR	    100
11			이메일	EMAIL	    VARCHAR	    255
12			사용여부	USE_YN	    MEDIUMINT	9				Y : 활성, N : 비활성
13			오픈일	OPEN_DT	    TIMESTAMP			'0000-00-00 00:00:00'
14			지점대표번호	CONTACT	VARCHAR	100
15			시도	    SIDO	VARCHAR	100
16			시군구	SIGUNGU	VARCHAR	100
17			법정동/법정리	BNAME	VARCHAR	100
18			네비게이션	NAVI	VARCHAR	255
19			버스	    BUS	VARCHAR	255
20			지하철	SUBWAY	VARCHAR	255
21			우선순위	PRIORITY	INT	11	X
22		O	지점사진ID 1	PIC01	VARCHAR 	100			T_FILE.FILE_ID
23		O	지점사진ID 2	PIC02	VARCHAR	    100			T_FILE.FILE_ID
24		O	지점사진ID 3	PIC03	VARCHAR	    100			T_FILE.FILE_ID
25		O	지점사진ID 4	PIC04	VARCHAR 	100			T_FILE.FILE_ID
26		O	지점사진ID 5	PIC05	VARCHAR 	100			T_FILE.FILE_ID
27			온도      	TEMP	VARCHAR	7
28			습도	        HUMIDITY	VARCHAR	7
    * */
}
