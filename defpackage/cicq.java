package defpackage;

import com.google.android.ims.rcsservice.group.GroupInfo;
import com.google.android.ims.rcsservice.group.UserInfo;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes8.dex */
public abstract class cicq {
    public abstract void A(Optional optional);

    public abstract void B(boolean z);

    public abstract cicq C();

    public final cicr D() {
        if (h().equals(Optional.of(-1L))) {
            ((eksl) cicr.w.n().h("com/google/android/apps/messaging/shared/rcs/conversation/RcsConversationAndThreadIdQueryParameters$Builder", "build", 215, "RcsConversationAndThreadIdQueryParameters.java")).q("INVALID session ID provided in RcsConversationAndThreadIdQueryParameters. Ignoring the session ID.");
            A(Optional.empty());
        }
        if (f().isPresent()) {
            if (g().isEmpty()) {
                ((eksl) cicr.w.n().h("com/google/android/apps/messaging/shared/rcs/conversation/RcsConversationAndThreadIdQueryParameters$Builder", "build", 224, "RcsConversationAndThreadIdQueryParameters.java")).q("RCS group self-msisdn not provided in RcsConversationAndThreadIdQueryParameters. Ignoring the rcsGroupSelfMsisdn");
                x(Optional.empty());
            }
            if (e().isEmpty() && !ejwk.c(((GroupInfo) f().get()).c)) {
                String str = ((GroupInfo) f().get()).c;
                str.getClass();
                u(str);
            }
            if (d().isEmpty() && !ejwk.c(((GroupInfo) f().get()).d)) {
                String str2 = ((GroupInfo) f().get()).d;
                str2.getClass();
                s(str2);
            }
            if (b().isEmpty() && ((GroupInfo) f().get()).a != null) {
                String str3 = ((GroupInfo) f().get()).a;
                str3.getClass();
                n(str3);
            }
            if (c().isEmpty() && !((GroupInfo) f().get()).b.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                for (UserInfo userInfo : ((GroupInfo) f().get()).b) {
                    if (!userInfo.d) {
                        arrayList.add(bbbd.b(userInfo.a));
                    }
                }
                r(arrayList);
            }
        }
        return a();
    }

    public abstract cicr a();

    public abstract Optional b();

    public abstract Optional c();

    public abstract Optional d();

    public abstract Optional e();

    public abstract Optional f();

    public abstract Optional g();

    public abstract Optional h();

    public abstract void i(ajsm ajsmVar);

    public abstract void j(boolean z);

    public abstract void k(eyga eygaVar);

    public abstract void l(Optional optional);

    public abstract void m(awjl awjlVar);

    public abstract void n(String str);

    public abstract void o(boolean z);

    public abstract void p(boolean z);

    public abstract void q(boolean z);

    public abstract void r(List list);

    public abstract void s(String str);

    public abstract void t(cigb cigbVar);

    public abstract void u(String str);

    public abstract void v(int i);

    public abstract void w(emaf emafVar);

    public abstract void x(Optional optional);

    public abstract void y(String str);

    public abstract void z(long j);
}
