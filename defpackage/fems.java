package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fems implements Serializable {
    private static final long serialVersionUID = -1654118204678581940L;
    public final ferc a;
    public final fenb b;

    public fems() {
        ferc fercVar = new ferc();
        fenb fenbVar = new fenb();
        this.a = fercVar;
        this.b = fenbVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final femz a() {
        fenb fenbVar = this.b;
        int size = fenbVar.size();
        int i = 0;
        while (i < size) {
            femz femzVar = (femz) fenbVar.get(i);
            i++;
            if (femzVar.a.equals("VTIMEZONE")) {
                return femzVar;
            }
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof fems)) {
            return super.equals(obj);
        }
        fems femsVar = (fems) obj;
        ffhf ffhfVar = new ffhf();
        ffhfVar.c(this.a, femsVar.a);
        ffhfVar.c(this.b, femsVar.b);
        return ffhfVar.a;
    }

    public final int hashCode() {
        ffhg ffhgVar = new ffhg();
        ffhgVar.c(this.a);
        ffhgVar.c(this.b);
        return ffhgVar.a;
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer("BEGIN:VCALENDAR\r\n");
        stringBuffer.append(this.a);
        stringBuffer.append(this.b);
        stringBuffer.append("END:VCALENDAR\r\n");
        return stringBuffer.toString();
    }
}
