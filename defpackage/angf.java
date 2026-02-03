package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class angf implements angg {
    public final anbi a;
    public final andw b;
    public final ekgp c;
    public final ajts d;
    private final fdjx e;

    public angf(fdjx fdjxVar, anbi anbiVar, andw andwVar, ekgp ekgpVar, ajts ajtsVar) {
        fdjxVar.getClass();
        andwVar.getClass();
        ekgpVar.getClass();
        ajtsVar.getClass();
        this.e = fdjxVar;
        this.a = anbiVar;
        this.b = andwVar;
        this.c = ekgpVar;
        this.d = ajtsVar;
    }

    @Override // defpackage.angg
    public final eiju a(MessageId messageId) {
        return auvw.c(this.e, fcyi.a, fdjz.a, new ange(this, messageId, null));
    }
}
