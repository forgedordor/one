package defpackage;

import java.util.concurrent.TimeUnit;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdhl {
    public static final fdhl a;
    public static final fdhl b;
    public static final fdhl c;
    public static final fdhl d;
    public static final fdhl e;
    public static final fdhl f;
    public static final fdhl g;
    private static final /* synthetic */ fdhl[] i;
    public final TimeUnit h;

    static {
        fdhl fdhlVar = new fdhl("NANOSECONDS", 0, TimeUnit.NANOSECONDS);
        a = fdhlVar;
        fdhl fdhlVar2 = new fdhl("MICROSECONDS", 1, TimeUnit.MICROSECONDS);
        b = fdhlVar2;
        fdhl fdhlVar3 = new fdhl("MILLISECONDS", 2, TimeUnit.MILLISECONDS);
        c = fdhlVar3;
        fdhl fdhlVar4 = new fdhl("SECONDS", 3, TimeUnit.SECONDS);
        d = fdhlVar4;
        fdhl fdhlVar5 = new fdhl("MINUTES", 4, TimeUnit.MINUTES);
        e = fdhlVar5;
        fdhl fdhlVar6 = new fdhl("HOURS", 5, TimeUnit.HOURS);
        f = fdhlVar6;
        fdhl fdhlVar7 = new fdhl("DAYS", 6, TimeUnit.DAYS);
        g = fdhlVar7;
        fdhl[] fdhlVarArr = {fdhlVar, fdhlVar2, fdhlVar3, fdhlVar4, fdhlVar5, fdhlVar6, fdhlVar7};
        i = fdhlVarArr;
        fczb.a(fdhlVarArr);
    }

    private fdhl(String str, int i2, TimeUnit timeUnit) {
        this.h = timeUnit;
    }

    public static fdhl[] values() {
        return (fdhl[]) i.clone();
    }
}
