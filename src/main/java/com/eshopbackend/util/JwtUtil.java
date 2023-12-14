package com.eshopbackend.util;



import java.util.Date;

import com.eshopbackend.entity.User;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

public class JwtUtil {
	private static final String SECRET_KEY = "{Ul>\"ZwHW;ARY:,/4amj3fRM}uMM/yI$gdo!$d>BZoo^RSd5$cTN@^2&SiId\"oAQ0%g9b~y>:;\"TuMum]a2,B8=_9hH%gk()-F1\\S+HR}\"6#g%pu4<\"b\\29MH]YB?BI-^/P~+oR.J6nhqIT-6?ij}*1wW!iovzzgZQB7FXa<D.s!;,Q/UKvqCkO',.|Y-b;V]XEtvP*B[xlcUyLu-v,W+cH<T%mk[xd@>WYc-T\\\"{#KQRmTihsvC(K)^CKVh}Z:pQzM\\t]0pn,QoI$5+4OI8BRuY.F@'cS7B?0xC%(dDw4?6!qo|PS+*|>1~hB$q5Sd\\dY6=5?zL1hwZL7>kfV1\"UbeaB_PWl1=yH;]-DGo$ud?LY!jX7'qQX9z((>$Q%mMiW61'#}#sT!}aM+uObo2yZn}p|AK;Qkdj#fM]uK&#Yz}NFg$xY-t^NOb:vLc$qgQSIJ@->zL6mg|p!kNxYlvc-.gNfx.p:szH$TnHhh{.N@HM6A\"=&#c-p'-kuBBx";
//    private static final long EXPIRATION_TIME = 86400000; // 1 days
	private static final long EXPIRATION_TIME = 1800000; // 30 mins

    public static String generateToken(User user) {
        return Jwts.builder()
            .setSubject(user.getEmail())
            .setIssuedAt(new Date())
            .setExpiration(new Date(System.currentTimeMillis() + EXPIRATION_TIME))
            .signWith(SignatureAlgorithm.HS512, SECRET_KEY)
            .compact();
    }

    public static boolean validateToken(String token, User user) {
        String username = extractEmail(token);
        return username.equals(user.getEmail()) && !isTokenExpired(token);
    }

    private static String extractEmail(String token) {
        return Jwts.parser().setSigningKey(SECRET_KEY).parseClaimsJws(token).getBody().getSubject();
    }

    private static boolean isTokenExpired(String token) {
        return Jwts.parser().setSigningKey(SECRET_KEY).parseClaimsJws(token).getBody().getExpiration().before(new Date());
    }

}
