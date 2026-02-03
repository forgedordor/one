package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zeh implements alfa {
    private final String a;
    private final long b;
    private final String c;
    private final alfd d = alfd.f;

    public zeh(zen zenVar, amwc amwcVar) {
        this.a = zenVar.a.getString(R.string.calendar_suggestion_event_description);
        this.b = ((anmo) amwcVar).a;
        this.c = amwcVar.a();
    }

    @Override // defpackage.alff
    public final alfd a() {
        return this.d;
    }

    @Override // defpackage.alff
    public final String b() {
        return this.c;
    }

    @Override // defpackage.alfa
    public final Long c() {
        return null;
    }

    @Override // defpackage.alfa
    public final Long d() {
        return Long.valueOf(this.b);
    }

    @Override // defpackage.alfa
    public final String e() {
        return this.a;
    }

    @Override // defpackage.alfa
    public final String f() {
        return null;
    }

    @Override // defpackage.alfa
    public final String g() {
        return null;
    }
}
