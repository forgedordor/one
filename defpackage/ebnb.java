package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ebnb extends ebnj implements Comparable {
    public final fgyk a;
    public final fgzq b;
    private final String c;
    private final String d;
    private final ebni e;

    public ebnb(fgyk fgykVar, fgzq fgzqVar, String str, String str2, ebni ebniVar) {
        fgykVar.getClass();
        this.a = fgykVar;
        fgzqVar.getClass();
        this.b = fgzqVar;
        str.getClass();
        this.c = str;
        str2.getClass();
        this.d = str2;
        this.e = ebniVar;
    }

    @Override // defpackage.ebnj
    public final int a() {
        return this.b.c;
    }

    @Override // defpackage.ebnj
    public final ebmr b() {
        String string = this.b.f.toString();
        dhip dhipVar = ebna.a;
        if (string.startsWith("_sip._udp")) {
            return ebmr.UDP;
        }
        if (string.startsWith("_sip._tcp")) {
            return ebmr.TCP;
        }
        if (string.startsWith("_sips._tcp")) {
            return ebmr.TLS;
        }
        dhja.r(ebna.a, "NAPTR response contains unknown protocol: %s", string);
        return null;
    }

    @Override // defpackage.ebnj
    public final String c() {
        return this.d;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        ebnb ebnbVar = (ebnb) obj;
        if (this == ebnbVar) {
            return 0;
        }
        if (ebnbVar == null) {
            return -1;
        }
        ebni ebniVar = this.e;
        if (!Objects.equals(b(), ebnbVar.b())) {
            ebmr ebmrVar = ((ebms) ebniVar).c;
            if (ebmrVar.equals(b())) {
                return -1;
            }
            if (ebmrVar.equals(ebnbVar.b())) {
                return 1;
            }
        }
        if (((ebms) ebniVar).b && e() != ebnbVar.e()) {
            return !e() ? 1 : -1;
        }
        fgyk fgykVar = this.a;
        fgyk fgykVar2 = ebnbVar.a;
        int i = fgykVar.a;
        int i2 = fgykVar2.a;
        if (i != i2) {
            return i - i2;
        }
        int i3 = fgykVar.b;
        int i4 = fgykVar2.b;
        if (i3 != i4) {
            return i3 - i4;
        }
        fgzq fgzqVar = this.b;
        fgzq fgzqVar2 = ebnbVar.b;
        int i5 = fgzqVar.a;
        int i6 = fgzqVar2.a;
        if (i5 != i6) {
            return i5 - i6;
        }
        int i7 = fgzqVar.b;
        int i8 = fgzqVar2.b;
        if (i7 <= 0) {
            return 1;
        }
        if (i8 <= 0) {
            return -1;
        }
        return i8 - i7;
    }

    @Override // defpackage.ebnj
    public final String d() {
        return this.c;
    }
}
