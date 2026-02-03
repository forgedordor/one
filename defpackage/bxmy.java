package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;

/* compiled from: PG */
/* loaded from: classes7.dex */
public abstract class bxmy {
    public static final cqce a = cqce.g("BugleResizing", "ResizingJob");
    protected final Uri b;
    protected final Uri c;
    protected final long d;
    protected String e;
    public boolean f;
    private final bxmx g;
    private bvdt h;
    private final ayju i;

    public bxmy(MessagePartCoreData messagePartCoreData, bxmx bxmxVar, ayju ayjuVar) {
        this.b = messagePartCoreData.w();
        this.c = messagePartCoreData.t();
        this.d = messagePartCoreData.p();
        this.e = messagePartCoreData.R();
        this.g = bxmxVar;
        this.i = ayjuVar;
    }

    protected abstract void a();

    protected abstract boolean b();

    public final void c() {
        cqaz.h();
        this.h = bvdt.FAILED;
        try {
            try {
                try {
                    try {
                        cqbd cqbdVarA = a.a();
                        cqbdVarA.I("Starting");
                        cqbdVarA.I(getClass().getName());
                        cqbdVarA.A("contentUri", this.c);
                        cqbdVarA.A("outputUri", this.b);
                        cqbdVarA.z("maxFileSize", this.d);
                        cqbdVarA.r();
                        if (b()) {
                            this.h = bvdt.SUCCEEDED;
                        }
                    } catch (Exception e) {
                        cqbd cqbdVarE = a.e();
                        cqbdVarE.I("Exception while transcoding.");
                        cqbdVarE.A("contentUri", this.c);
                        cqbdVarE.s(e);
                        if (e instanceof cqbh) {
                            this.h = bvdt.TOO_LARGE;
                        }
                    }
                } finally {
                    cqbd cqbdVarA2 = a.a();
                    cqbdVarA2.I(getClass().getName());
                    cqbdVarA2.A("status", this.h);
                    cqbdVarA2.A("contentUri", this.c);
                    Uri uri = this.b;
                    cqbdVarA2.A("outputUri", uri);
                    cqbdVarA2.r();
                    this.f = true;
                    eieu eieuVarK = eiiy.k("ResizingJob::onFinished");
                    this.g.a(uri);
                    eieuVarK.close();
                    Uri uri2 = this.c;
                    if (uri2 != null) {
                        eieu eieuVarK2 = eiiy.k("ResizingJob::startUAARA");
                        this.i.a(uri2.toString(), this.b.toString(), this.e, this.h).z();
                        eieuVarK2.close();
                    }
                }
            } catch (Throwable th) {
                try {
                    "ResizingJob::startUAARA".close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            try {
                "ResizingJob::onFinished".close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }
}
