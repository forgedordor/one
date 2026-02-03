package defpackage;

import android.util.Log;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import java.util.Collection;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class cqds {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/util/common/TrackingLog");
    public final StringBuilder b;
    public String c;
    public boolean d;
    private int e;
    private final cqbz f;
    private final int g;

    /* compiled from: PG */
    public interface a {
        cqcl cD();
    }

    public cqds() {
        this.b = new StringBuilder();
        this.g = 1;
        this.f = null;
    }

    public final void A(String str, Object obj) {
        if (this.d) {
            q(str);
            this.b.append(obj);
        }
    }

    public final void B(String str, boolean z) {
        if (this.d) {
            q(str);
            this.b.append(z);
        }
    }

    public final void C(String str, Object[] objArr) {
        if (this.d) {
            q(str);
            if (objArr == null) {
                this.b.append("null");
                return;
            }
            StringBuilder sb = this.b;
            sb.append('{');
            int length = objArr.length;
            if (length > 0) {
                sb.append(objArr[0]);
                for (int i = 1; i < length; i++) {
                    sb.append(", ");
                    sb.append(objArr[i]);
                }
            }
            sb.append('}');
        }
    }

    public final void D(String str, CharSequence charSequence) {
        if (this.d) {
            StringBuilder sb = this.b;
            sb.append(' ');
            sb.append(str);
            sb.append('{');
            sb.append(cqcv.b(charSequence));
            sb.append('}');
        }
    }

    public final void E(String str, String str2, int i) {
        if (this.d) {
            StringBuilder sb = this.b;
            sb.append(' ');
            sb.append(str);
            sb.append('{');
            sb.append(str2);
            sb.append(':');
            sb.append(i);
            sb.append('}');
        }
    }

    public final void F(String str, String str2, Object obj) {
        if (this.d) {
            StringBuilder sb = this.b;
            sb.append(' ');
            sb.append(str);
            sb.append('{');
            sb.append(str2);
            sb.append(':');
            sb.append(obj);
            sb.append('}');
        }
    }

    public final void G(int i) {
        if (this.d) {
            StringBuilder sb = this.b;
            sb.append(' ');
            sb.append(i);
        }
    }

    public final void H(long j) {
        if (this.d) {
            StringBuilder sb = this.b;
            sb.append(' ');
            sb.append(j);
        }
    }

    public final void I(Object obj) {
        if (this.d) {
            StringBuilder sb = this.b;
            sb.append(' ');
            sb.append(obj);
        }
    }

    public final void J(boolean z) {
        if (this.d) {
            StringBuilder sb = this.b;
            sb.append(' ');
            sb.append(z);
        }
    }

    @Deprecated
    public final void K(cqbr cqbrVar, Object obj) {
        if (!this.d || cqbrVar.a(this, obj)) {
            return;
        }
        this.d = false;
        this.b.setLength(0);
    }

    public final void L(String str, Collection collection) {
        if (collection == null) {
            F(str, "size", "null");
        } else {
            E(str, "size", collection.size());
        }
    }

    public final void M(String str, CharSequence charSequence) {
        x(str, charSequence, 1);
    }

    public final void N(String str, Object obj) {
        if (this.d) {
            q(str);
            this.b.append(((a) cqtf.a(a.class)).cD().a(obj == null ? "" : obj.toString(), 1));
        }
    }

    public final void O(String str, Collection collection) {
        if (collection.isEmpty()) {
            return;
        }
        L(str, collection);
    }

    public final void q(String str) {
        char cCharAt;
        StringBuilder sb = this.b;
        int length = sb.length();
        if (length > 0 && (cCharAt = sb.charAt(length - 1)) != '.' && cCharAt != ',' && cCharAt != ';' && cCharAt != ':') {
            sb.append(',');
        }
        sb.append(' ');
        sb.append(str);
        sb.append(": ");
    }

    public final void r() {
        cqbz cqbzVar;
        if (this.d) {
            StringBuilder sb = this.b;
            if (sb.length() > 0) {
                if (this.g == 1 || (cqbzVar = this.f) == null) {
                    int i = this.e;
                    String str = this.c;
                    String string = sb.toString();
                    if (cqca.q(str, i)) {
                        ejwl.b(str.length() <= 23, "Tag must be <=23 chars");
                        ekrd ekrdVarA = cqca.a.a(cqca.b(i));
                        ekrdVarA.X(eksq.a, str);
                        ekrdVarA.Y(ekrq.a);
                        ((ekrd) ekrdVarA.h("com/google/android/apps/messaging/shared/util/common/LogUtil", "println", 539, "LogUtil.java")).t("%s", string);
                    }
                } else {
                    cqbzVar.b(this.e, this.c, sb.toString());
                }
                sb.setLength(0);
            }
        }
    }

    public final void s(Throwable th) {
        if (this.d) {
            if (this.g != 1) {
                StringBuilder sb = this.b;
                if (sb.length() > 0) {
                    sb.append('\n');
                }
                sb.append(Log.getStackTraceString(th));
                r();
                return;
            }
            ekrd ekrdVarA = a.a(cqca.b(this.e));
            ekrdVarA.X(eksq.a, this.c);
            ekrdVarA.Y(ekrq.a);
            ekrd ekrdVar = (ekrd) ((ekrd) ekrdVarA.g(th)).h("com/google/android/apps/messaging/shared/util/common/TrackingLog", ConversationSuggestion.SUGGESTION_PROPERTY_CALENDAR_END_TIME, 80, "TrackingLog.java");
            StringBuilder sb2 = this.b;
            ekrdVar.t("%s", sb2);
            sb2.setLength(0);
        }
    }

    public final void t(int i, String str, cqbs cqbsVar) {
        boolean z = true;
        if (this.g != 2 && !cqca.q(str, i)) {
            z = false;
        }
        this.d = z;
        if (z) {
            this.e = i;
            this.c = str;
            StringBuilder sb = this.b;
            cqbsVar.a(sb);
            sb.append(':');
        }
    }

    public final void u(char c) {
        if (this.d) {
            this.b.append(c);
        }
    }

    public final void v(Object obj) {
        if (this.d) {
            this.b.append(obj);
        }
    }

    public final void w(long j) {
        if (this.d) {
            StringBuilder sb = this.b;
            sb.append(" {x-message-id:");
            sb.append(j);
            sb.append('}');
        }
    }

    public final void x(String str, CharSequence charSequence, int i) {
        if (this.d) {
            q(str);
            this.b.append(((a) cqtf.a(a.class)).cD().a(charSequence == null ? "" : charSequence.toString(), i));
        }
    }

    public final void y(String str, int i) {
        if (this.d) {
            q(str);
            this.b.append(i);
        }
    }

    public final void z(String str, long j) {
        if (this.d) {
            q(str);
            this.b.append(j);
        }
    }

    protected cqds(cqbz cqbzVar) {
        this.b = new StringBuilder();
        this.g = 2;
        this.f = cqbzVar;
    }
}
