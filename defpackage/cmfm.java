package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cmfm extends cmgh {
    public final cmfn a;
    public final Optional b;
    public final evuh c;
    public final Optional d;
    public final Optional e;
    public final boolean f;

    public cmfm(cmfn cmfnVar, Optional optional, evuh evuhVar, Optional optional2, Optional optional3, boolean z) {
        this.a = cmfnVar;
        this.b = optional;
        this.c = evuhVar;
        this.d = optional2;
        this.e = optional3;
        this.f = z;
    }

    @Override // defpackage.cmgh
    public final cmfn a() {
        return this.a;
    }

    @Override // defpackage.cmgh
    public final Optional b() {
        return this.b;
    }

    public final String toString() {
        Optional optional = this.e;
        Optional optional2 = this.d;
        evuh evuhVar = this.c;
        Optional optional3 = this.b;
        return "SettingsStoreConfig{key=" + this.a.toString() + ", subKey=" + String.valueOf(optional3) + ", schema=" + evuhVar.toString() + ", migration=" + String.valueOf(optional2) + ", invalidProtocolBufferException=" + String.valueOf(optional) + ", enableCache=" + this.f + "}";
    }
}
