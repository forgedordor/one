package defpackage;

import com.android.vcard.VCardBuilder;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fesg extends fero {
    private static final long serialVersionUID = 2547948989200697335L;
    public final fenb c;
    private final Map d;

    public fesg() {
        super("VEVENT");
        HashMap map = new HashMap();
        this.d = map;
        map.put(fevh.f, new fery());
        map.put(fevh.g, new ferz());
        map.put(fevh.i, new fesa());
        map.put(fevh.j, new fesb());
        map.put(fevh.c, new fesc());
        map.put(fevh.h, new fesd());
        map.put(fevh.e, new fese());
        map.put(fevh.d, new fesf());
        this.c = new fenb();
        this.b.add(new feut());
    }

    public final feuu c() {
        return (feuu) a("DTSTART");
    }

    public final feuw d() {
        return (feuw) a("DURATION");
    }

    @Override // defpackage.femz
    public final boolean equals(Object obj) {
        return obj instanceof fesg ? super.equals(obj) && ffhd.a(this.c, ((fesg) obj).c) : super.equals(obj);
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

    public fesg(ferc fercVar) {
        super("VEVENT", fercVar);
        HashMap map = new HashMap();
        this.d = map;
        map.put(fevh.f, new fery());
        map.put(fevh.g, new ferz());
        map.put(fevh.i, new fesa());
        map.put(fevh.j, new fesb());
        map.put(fevh.c, new fesc());
        map.put(fevh.h, new fesd());
        map.put(fevh.e, new fese());
        map.put(fevh.d, new fesf());
        this.c = new fenb();
    }
}
