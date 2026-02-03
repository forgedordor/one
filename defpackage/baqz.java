package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import j$.util.Optional;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public abstract class baqz {
    public abstract bara a();

    public abstract Optional b();

    public abstract Optional c();

    public abstract Optional d();

    public abstract boolean e();

    public abstract void f(bvdk bvdkVar);

    public abstract void g(ajsm ajsmVar);

    public abstract void h(String str);

    public abstract void i(Optional optional);

    public abstract void j(awjl awjlVar);

    public abstract void k(boolean z);

    public abstract void l(boolean z);

    public abstract void m(int i);

    public abstract void n(boolean z);

    public abstract void o(boolean z);

    public abstract void p(List list);

    public abstract void q(String str);

    public abstract void r(Optional optional);

    public abstract void s(long j);

    public abstract void t(int i);

    public abstract void u(SelfIdentityId selfIdentityId);

    public abstract void v(boolean z);

    public abstract void w();

    public abstract void x(cnqj cnqjVar);

    public final bara y() {
        if (e()) {
            if (c().isEmpty()) {
                ((eksl) ((eksl) bara.x.j()).h("com/google/android/apps/messaging/shared/datamodel/data/conversation/GetOrCreateConversationParameters$Builder", "build", 238, "GetOrCreateConversationParameters.java")).q("Attempting to create a RCS group conversation without RCS group ID.");
            }
            if (d().isEmpty()) {
                ((eksl) ((eksl) bara.x.j()).h("com/google/android/apps/messaging/shared/datamodel/data/conversation/GetOrCreateConversationParameters$Builder", "build", 243, "GetOrCreateConversationParameters.java")).q("Attempting to create a RCS group conversation without RCS group self MSISDN.");
            }
        } else {
            b().isPresent();
        }
        return a();
    }
}
