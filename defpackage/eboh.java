package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eboh extends ebmd implements Cloneable {
    public String a = "SIP";
    public String b = "2.0";
    public String c = "UDP";

    @Override // defpackage.ebmd
    public final String c() {
        return this.a.toUpperCase(Locale.US) + "/" + this.b + "/" + this.c.toUpperCase(Locale.US);
    }

    @Override // defpackage.ebmd
    public final Object clone() {
        eboh ebohVar = new eboh();
        String str = this.a;
        if (str != null) {
            ebohVar.a = str;
        }
        String str2 = this.b;
        if (str2 != null) {
            ebohVar.b = str2;
        }
        String str3 = this.c;
        if (str3 != null) {
            ebohVar.c = str3;
        }
        return ebohVar;
    }

    public final boolean equals(Object obj) {
        if (obj != null) {
            if (obj.getClass().equals(getClass())) {
                eboh ebohVar = (eboh) obj;
                return this.a.compareToIgnoreCase(ebohVar.a) == 0 && this.b.compareToIgnoreCase(ebohVar.b) == 0 && this.c.compareToIgnoreCase(ebohVar.c) == 0;
            }
        }
        return false;
    }

    public final int hashCode() {
        return 999998888;
    }
}
