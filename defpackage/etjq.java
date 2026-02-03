package defpackage;

import com.android.vcard.VCardConfig;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etjq {
    public final etil a;

    public etjq(etil etilVar) {
        this.a = etilVar;
    }

    public final /* synthetic */ etin a() {
        evsn evsnVarBuild = this.a.build();
        evsnVarBuild.getClass();
        return (etin) evsnVarBuild;
    }

    public final void b(etjo etjoVar) {
        etil etilVar = this.a;
        etilVar.copyOnWrite();
        etin etinVar = (etin) etilVar.instance;
        etin etinVar2 = etin.a;
        etinVar.h = etjoVar;
        etinVar.b |= VCardConfig.FLAG_APPEND_TYPE_PARAM;
    }
}
