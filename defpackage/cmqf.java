package defpackage;

import android.net.Uri;
import j$.time.Instant;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes8.dex */
public interface cmqf {
    public static final ejxr a = ejxx.a(new ejxr() { // from class: cmqc
        @Override // defpackage.ejxr
        public final Object get() {
            int i = cmqd.a;
            return cdag.m(cdag.b, "enable_forward_sync_management_redesign", true);
        }
    });
    public static final cczi b = cdag.j(cdag.b, "forward_sync_cache_size", 1000);

    long a(long j);

    cnvx b(long j);

    eiju c(boolean z, long j, long j2, long j3, UUID uuid);

    eiju d();

    eiju e();

    eiju f(enqq enqqVar);

    void g();

    @Deprecated
    void h();

    void i(long j);

    @Deprecated
    void j(long j, enqq enqqVar);

    @Deprecated
    void k(enqq enqqVar);

    @Deprecated
    void l(enqq enqqVar);

    @Deprecated
    void m(Uri uri, Instant instant);

    void n();

    void o(ctz ctzVar);

    void p(boolean z);

    void q(boolean z);

    void r(long j);

    @Deprecated
    boolean s();

    boolean t(long j);

    @Deprecated
    boolean u();

    boolean v();

    boolean w(long j);
}
