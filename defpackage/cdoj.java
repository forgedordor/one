package defpackage;

import android.net.Uri;
import com.google.android.gms.kids.IndividualContactRequest;
import com.google.android.gms.kids.UriWithType;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdoj {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/kids/intents/TrustedContactsIntents");
    public final fcsu b;
    public final fcsu c;
    public final fcsu d;
    public final fcsu e;
    public final anty f;
    public final anvh g;
    public final aqcc h;

    public cdoj(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, anty antyVar, anvh anvhVar, aqcc aqccVar) {
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        fcsuVar4.getClass();
        antyVar.getClass();
        anvhVar.getClass();
        this.b = fcsuVar;
        this.c = fcsuVar2;
        this.d = fcsuVar4;
        this.e = fcsuVar5;
        this.f = antyVar;
        this.g = anvhVar;
        this.h = aqccVar;
    }

    public static final Uri b(String str) {
        Uri uriBuild = new Uri.Builder().scheme("sms").opaquePart(str).build();
        uriBuild.getClass();
        return uriBuild;
    }

    public static final IndividualContactRequest c(String str) {
        IndividualContactRequest individualContactRequest = new IndividualContactRequest();
        UriWithType uriWithType = new UriWithType();
        uriWithType.a = b(str);
        individualContactRequest.b = new UriWithType[]{uriWithType};
        return individualContactRequest;
    }

    public final Object a(String str, fcxy fcxyVar) {
        Object objB = this.b.b();
        objB.getClass();
        return fdin.a(eicg.a((fcyh) objB), new cdoi(null, this, str), fcxyVar);
    }
}
