package defpackage;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejlz {
    public static final Pattern a = Pattern.compile("(?i)(account|acct|ac|A/C)\\s*((number|no|n)\\.?\\s+)?([\\*X0-9]+[0-9]{4,})");
    public static final Pattern b = Pattern.compile("(?i)([0-9]{4,}[*X]{4,}[0-9]{4,})");

    public static List a(Pattern pattern, String str, int i) {
        Matcher matcher = pattern.matcher(str);
        int i2 = ekgb.d;
        ekfw ekfwVar = new ekfw();
        while (matcher.find()) {
            if (matcher.groupCount() >= i) {
                ezdr ezdrVar = (ezdr) ezds.a.createBuilder();
                int iStart = matcher.start(i);
                ezdrVar.copyOnWrite();
                ((ezds) ezdrVar.instance).h = iStart;
                int iEnd = matcher.end(i);
                ezdrVar.copyOnWrite();
                ((ezds) ezdrVar.instance).i = iEnd;
                eyzy eyzyVar = eyzy.SIMPLE_ANNOTATION;
                ezdrVar.copyOnWrite();
                ((ezds) ezdrVar.instance).e = eyzyVar.a();
                ezdrVar.copyOnWrite();
                ((ezds) ezdrVar.instance).f = "ACCOUNT_NUMBER";
                ezga ezgaVar = (ezga) ezgb.a.createBuilder();
                String strGroup = matcher.group(i);
                ezgaVar.copyOnWrite();
                ezgb ezgbVar = (ezgb) ezgaVar.instance;
                strGroup.getClass();
                ezgbVar.b = strGroup;
                ezgb ezgbVar2 = (ezgb) ezgaVar.build();
                ezdrVar.copyOnWrite();
                ezds ezdsVar = (ezds) ezdrVar.instance;
                ezgbVar2.getClass();
                ezdsVar.d = ezgbVar2;
                ezdsVar.c = 13;
                ekfwVar.h((ezds) ezdrVar.build());
            }
        }
        return ekfwVar.g();
    }
}
