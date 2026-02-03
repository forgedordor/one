package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface cqom {
    public static final String a = (String) cqol.a.e();

    @fhfe(a = "v1/registershare")
    ListenableFuture<cqpv> a(@fhfj(a = "key") String str, @fhfj(a = "id") String str2, @fhfj(a = "q") String str3, @fhfj(a = "locale") String str4);

    @fhev(a = "v1/search")
    ListenableFuture<cqpw> b(@fhfj(a = "key") String str, @fhfj(a = "q") String str2, @fhfj(a = "limit") int i, @fhfj(a = "locale") String str3, @fhfj(a = "contentfilter") String str4);
}
