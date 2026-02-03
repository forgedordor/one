package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.concurrent.Callable;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class casz extends cayv {
    public final Context a;
    public final Optional b;
    public final apsl c;
    public final fcsu d;
    private final eosc e;

    public casz(eosc eoscVar, Context context, Optional optional, apsl apslVar, fcsu fcsuVar) {
        this.e = eoscVar;
        this.a = context;
        this.b = optional;
        this.c = apslVar;
        this.d = fcsuVar;
    }

    @Override // defpackage.cazg
    public final eieu b() {
        return eiiy.k("CleanupPartUriHandler");
    }

    @Override // defpackage.cazg
    public final evuo d() {
        return catc.a.getParserForType();
    }

    @Override // defpackage.cayv
    protected final /* bridge */ /* synthetic */ eiju j(cayy cayyVar, evuh evuhVar) {
        final catc catcVar = (catc) evuhVar;
        return eijx.g(new Callable() { // from class: casw
            @Override // java.util.concurrent.Callable
            public final Object call() {
                catc catcVar2 = catcVar;
                casz caszVar = this.a;
                ContentResolver contentResolver = caszVar.a.getContentResolver();
                for (String str : catcVar2.b) {
                    try {
                        final Uri uri = Uri.parse(str);
                        contentResolver.delete(uri, null, null);
                        if (caszVar.c.a()) {
                            ((awlc) caszVar.d.b()).d(new Consumer() { // from class: casx
                                @Override // java.util.function.Consumer
                                /* renamed from: accept */
                                public final void z(Object obj) {
                                    ((cmvv) obj).b(uri);
                                }

                                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                    return Consumer$CC.$default$andThen(this, consumer);
                                }
                            });
                        } else {
                            caszVar.b.ifPresent(new Consumer() { // from class: casy
                                @Override // java.util.function.Consumer
                                /* renamed from: accept */
                                public final void z(Object obj) {
                                    ((cmvv) obj).b(uri);
                                }

                                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                    return Consumer$CC.$default$andThen(this, consumer);
                                }
                            });
                        }
                    } catch (IllegalArgumentException e) {
                        casz.E.o("Unable to remove message part data content with uri: ".concat(String.valueOf(str)), e);
                    } catch (SecurityException e2) {
                        casz.E.o("Unable to remove message part data content.", e2);
                    }
                }
                return cbcw.i();
            }
        }, this.e);
    }
}
