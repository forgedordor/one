package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.apps.messaging.conversation.draft.model.GalleryContent;
import com.google.android.apps.messaging.ui.mediapicker.c2o.content.AttachmentQueueState;
import com.google.android.apps.messaging.ui.mediapicker.c2o.gallery.data.GalleryContentItem;
import com.google.android.apps.messaging.videotrimmer.FileInfoResult;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.function.Consumer$CC;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czah extends czet {
    public static final cqce b = cqce.g("Bugle", "GalleryCategoryPresenter");
    private final eosc A;
    private final abvt B;
    public final Context c;
    public final cogw d;
    public final crma e;
    public final fcsu f;
    public final czbw g;
    public final cyvc h;
    public final acgu i;
    public final List j;
    public final List k;
    public final eosc l;
    public final dakl m;
    public final srx n;
    public final abvt o;
    public final ea p;
    public Uri q;
    String r;
    public File s;
    final long t;
    final ejxr u;
    public final cwkb v;
    eiju w;
    public Function x;
    public int y;

    public czah(Context context, cogw cogwVar, acgu acguVar, crma crmaVar, fcsu fcsuVar, eosc eoscVar, eosc eoscVar2, dakl daklVar, srx srxVar, abvt abvtVar, abvt abvtVar2, ea eaVar, czbw czbwVar, AttachmentQueueState attachmentQueueState, cyvc cyvcVar, long j, ejxr ejxrVar) {
        super(attachmentQueueState);
        this.c = context;
        this.d = cogwVar;
        this.i = acguVar;
        this.e = crmaVar;
        this.f = fcsuVar;
        this.h = cyvcVar;
        this.g = czbwVar;
        this.A = eoscVar;
        this.l = eoscVar2;
        this.m = daklVar;
        this.n = srxVar;
        this.B = abvtVar;
        this.t = j;
        this.u = ejxrVar;
        this.o = abvtVar2;
        this.p = eaVar;
        this.v = null;
        this.j = new ArrayList();
        this.k = new ArrayList();
        ehqs.a(context).c().q(rtj.a()).p(rqi.b());
        if (abvtVar2.a().isPresent() && ((Boolean) ccze.m.e()).booleanValue()) {
            einf.c(eaVar, adhc.class, new eind() { // from class: czag
                @Override // defpackage.eind
                public final eine a(einb einbVar) {
                    adhc adhcVar = (adhc) einbVar;
                    this.a.c(adhcVar.a, null, true, adhcVar.b);
                    return eine.a;
                }
            });
        }
    }

    private final void h(final int i) {
        this.y = i;
        this.r = i == 2 ? "video/mp4" : "image/jpeg";
        ListenableFuture listenableFutureSubmit = this.A.submit(new Callable() { // from class: cyzz
            /* JADX WARN: Code restructure failed: missing block: B:36:0x0111, code lost:
            
                if (r8 != false) goto L43;
             */
            /* JADX WARN: Code restructure failed: missing block: B:37:0x0113, code lost:
            
                defpackage.cqca.f("Bugle", "GalleryCameraFileProvider: Could not create a shared media file after 10 tries.");
             */
            /* JADX WARN: Removed duplicated region for block: B:44:0x0139  */
            /* JADX WARN: Removed duplicated region for block: B:45:0x0142  */
            @Override // java.util.concurrent.Callable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object call() throws java.io.IOException {
                /*
                    Method dump skipped, instructions count: 348
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.cyzz.call():java.lang.Object");
            }
        });
        final String str = i == 1 ? "android.media.action.IMAGE_CAPTURE" : "android.media.action.VIDEO_CAPTURE";
        eork.r(listenableFutureSubmit, auwc.a(new cqob(new Consumer() { // from class: czaa
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                Uri uri = (Uri) obj;
                if (uri == null) {
                    return;
                }
                String str2 = str;
                Intent intentPutExtra = new Intent(str2).putExtra("output", uri);
                if (str2.equals("android.media.action.VIDEO_CAPTURE")) {
                    intentPutExtra.putExtra("android.intent.extra.durationLimit", ((Integer) ujw.m.e()).intValue());
                }
                cyzt cyztVar = ((cyyt) this.a.h).a.b;
                if (cyztVar != null) {
                    cyztVar.a(intentPutExtra);
                }
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        }, new Consumer() { // from class: czab
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                czah.b.o("Failed to create media file for capture", (Throwable) obj);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        })), this.l);
    }

    public final void a() {
        if (this.e.d()) {
            h(1);
        } else {
            ((crmg) this.f.b()).b(new crmf() { // from class: czac
                @Override // defpackage.crmf
                public final void b() {
                    this.a.a();
                }

                @Override // defpackage.crmf
                public final /* synthetic */ boolean c() {
                    return true;
                }

                @Override // defpackage.crmf
                public final /* synthetic */ void a() {
                }
            });
        }
    }

    public final void b() {
        if (this.e.f()) {
            h(2);
        } else {
            ((crmg) this.f.b()).d(new crmf() { // from class: czad
                @Override // defpackage.crmf
                public final void b() {
                    this.a.b();
                }

                @Override // defpackage.crmf
                public final /* synthetic */ boolean c() {
                    return true;
                }

                @Override // defpackage.crmf
                public final /* synthetic */ void a() {
                }
            });
        }
    }

    final void c(final GalleryContent galleryContent, final GalleryContentItem galleryContentItem, final boolean z, final int i) {
        int iD;
        String strB;
        bvdr bvdrVarI;
        final Uri uriA;
        int iC;
        if (((Boolean) daor.a.e()).booleanValue()) {
            Context context = this.c;
            context.getClass();
            if (daom.a(context.getPackageManager())) {
                bvdr bvdrVar = bvdr.STANDARD;
                if (((Boolean) ccze.m.e()).booleanValue() && galleryContent != null) {
                    uriA = galleryContent.e();
                    strB = galleryContent.b();
                    iD = galleryContent.f().getWidth();
                    iC = galleryContent.f().getHeight();
                    bvdrVarI = ((Boolean) cgwx.a.e()).booleanValue() ? galleryContent.i() : bvdrVar;
                } else if (galleryContentItem != null) {
                    uriA = galleryContentItem.a();
                    strB = galleryContentItem.b();
                    iD = galleryContentItem.d();
                    iC = galleryContentItem.c();
                } else {
                    iD = 0;
                    strB = "";
                    bvdrVarI = bvdrVar;
                    uriA = null;
                    iC = 0;
                }
                if (uriA == null || !le.z(strB) || !bvdrVarI.equals(bvdrVar)) {
                    e(galleryContent, galleryContentItem, z, i);
                    return;
                }
                eiju eijuVar = this.w;
                if (eijuVar != null) {
                    eijuVar.cancel(true);
                    this.w = null;
                }
                abvt abvtVar = this.B;
                abvtVar.getClass();
                final String str = strB;
                final int i2 = iD;
                final int i3 = iC;
                abvtVar.a().ifPresent(new Consumer() { // from class: cyzy
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void z(Object obj) {
                        final czah czahVar = this.a;
                        eiju eijuVarA = ((daot) obj).a(czahVar.c, uriA);
                        final String str2 = str;
                        final int i4 = i2;
                        final int i5 = i3;
                        final GalleryContent galleryContent2 = galleryContent;
                        final GalleryContentItem galleryContentItem2 = galleryContentItem;
                        final boolean z2 = z;
                        final int i6 = i;
                        ejvr ejvrVar = new ejvr() { // from class: cyzx
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj2) {
                                czah czahVar2 = czahVar;
                                FileInfoResult fileInfoResult = (FileInfoResult) obj2;
                                if (fileInfoResult != null) {
                                    String str3 = str2;
                                    long j = czahVar2.t;
                                    if (le.z(str3) && fileInfoResult.b > j) {
                                        int i7 = i5;
                                        int i8 = i4;
                                        daoh daohVar = new daoh(Uri.parse(fileInfoResult.a), j / 1024, i8, i7);
                                        ea eaVar = czahVar2.p;
                                        eaVar.getClass();
                                        einf.f(daohVar, eaVar);
                                        return null;
                                    }
                                }
                                int i9 = i6;
                                boolean z3 = z2;
                                czahVar2.e(galleryContent2, galleryContentItem2, z3, i9);
                                return null;
                            }
                        };
                        eosc eoscVar = czahVar.l;
                        eoscVar.getClass();
                        czahVar.w = eijuVarA.h(ejvrVar, eoscVar);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                return;
            }
        }
        e(galleryContent, galleryContentItem, z, i);
    }

    public final void d() {
        this.q = null;
        this.y = 0;
        this.r = null;
    }

    public final void e(uig uigVar, GalleryContentItem galleryContentItem, boolean z, int i) {
        if (((Boolean) ccze.m.e()).booleanValue() && uigVar != null) {
            f(uigVar, z, i);
        } else if (galleryContentItem != null) {
            g(galleryContentItem, z);
        }
    }
}
