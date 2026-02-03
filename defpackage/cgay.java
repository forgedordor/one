package defpackage;

import android.app.Notification;
import j$.util.Optional;

/* compiled from: PG */
@Deprecated
/* loaded from: classes2.dex */
public final class cgay implements cgbf {
    public final cqzr a;
    public final cgbe b;
    public final String c;
    public final Optional d;

    public cgay(cqzr cqzrVar, cgbe cgbeVar, String str, cgda cgdaVar) {
        this.a = cqzrVar;
        this.b = cgbeVar;
        this.c = str;
        this.d = Optional.ofNullable(cgdaVar);
    }

    @Override // defpackage.cgbf
    public final /* synthetic */ int a() {
        return cgbd.a(this);
    }

    @Override // defpackage.cgbf
    public final Notification b() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.cgbf
    public final cgbe c() {
        return this.b;
    }

    @Override // defpackage.cgbf
    public final String d() {
        return null;
    }
}
