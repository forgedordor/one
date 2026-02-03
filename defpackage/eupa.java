package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eupa {
    public final String a;
    public final euoz b;

    public eupa(String str, euoz euozVar) {
        this.a = str;
        this.b = euozVar;
        if (!euozVar.b()) {
            throw new IllegalArgumentException("Invalid positive geofilter");
        }
    }
}
