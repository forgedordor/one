package defpackage;

import com.android.vcard.VCardBuilder;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class efgz {
    public static final dhip c = new dhip("CpimMessageContent");

    public static efgy d() {
        efgo efgoVar = new efgo();
        efgoVar.c(evqs.b);
        return efgoVar;
    }

    public abstract ekgb a();

    public abstract evqs b();

    public abstract Optional c();

    public final String e() {
        return f().toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final StringBuilder f() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ((ekoe) a()).c; i += 2) {
            sb.append((String) a().get(i));
            sb.append(": ");
            sb.append((String) a().get(i + 1));
            sb.append(VCardBuilder.VCARD_END_OF_LINE);
        }
        sb.append(VCardBuilder.VCARD_END_OF_LINE);
        return sb;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Optional g() {
        ejwl.b(((ekoe) a()).c % 2 == 0, "No even number of headers entries!");
        for (int i = 0; i < ((ekoe) a()).c; i += 2) {
            if (ejuf.e((CharSequence) a().get(i), ffho.a)) {
                return Optional.of((String) a().get(i + 1));
            }
        }
        return Optional.empty();
    }
}
