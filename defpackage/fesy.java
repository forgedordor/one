package defpackage;

import com.android.vcard.VCardBuilder;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fesy extends fero {
    private static final long serialVersionUID = -269658210065896668L;
    public final fenb c;
    private final Map d;

    public fesy() {
        super("VTODO");
        HashMap map = new HashMap();
        this.d = map;
        map.put(fevh.f, new fesq());
        map.put(fevh.g, new fesr());
        map.put(fevh.i, new fess());
        map.put(fevh.j, new fest());
        map.put(fevh.c, new fesu());
        map.put(fevh.h, new fesv());
        map.put(fevh.e, new fesw());
        map.put(fevh.d, new fesx());
        this.c = new fenb();
        this.b.add(new feut());
    }

    @Override // defpackage.femz
    public final boolean equals(Object obj) {
        return obj instanceof fesy ? super.equals(obj) && ffhd.a(this.c, ((fesy) obj).c) : super.equals(obj);
    }

    @Override // defpackage.femz
    public final int hashCode() {
        ffhg ffhgVar = new ffhg();
        ffhgVar.c(this.a);
        ffhgVar.c(this.b);
        ffhgVar.c(this.c);
        return ffhgVar.a;
    }

    @Override // defpackage.femz
    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer("BEGIN:");
        stringBuffer.append(this.a);
        stringBuffer.append(VCardBuilder.VCARD_END_OF_LINE);
        stringBuffer.append(this.b);
        stringBuffer.append(this.c);
        stringBuffer.append("END:");
        stringBuffer.append(this.a);
        stringBuffer.append(VCardBuilder.VCARD_END_OF_LINE);
        return stringBuffer.toString();
    }

    public fesy(ferc fercVar) {
        super("VTODO", fercVar);
        HashMap map = new HashMap();
        this.d = map;
        map.put(fevh.f, new fesq());
        map.put(fevh.g, new fesr());
        map.put(fevh.i, new fess());
        map.put(fevh.j, new fest());
        map.put(fevh.c, new fesu());
        map.put(fevh.h, new fesv());
        map.put(fevh.e, new fesw());
        map.put(fevh.d, new fesx());
        this.c = new fenb();
    }
}
