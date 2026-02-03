package defpackage;

import android.app.Activity;
import android.net.Uri;
import android.os.Build;
import android.os.IBinder;
import android.view.Display;
import android.widget.photopicker.EmbeddedPhotoPickerFeatureInfo;
import android.widget.photopicker.EmbeddedPhotoPickerSession;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmxy extends fcyz implements fdat {
    final /* synthetic */ dmvk a;
    final /* synthetic */ Activity b;
    final /* synthetic */ fdae c;
    final /* synthetic */ hox d;
    final /* synthetic */ hox e;
    final /* synthetic */ hox f;
    final /* synthetic */ hox g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmxy(dmvk dmvkVar, Activity activity, fdae fdaeVar, hox hoxVar, hox hoxVar2, hox hoxVar3, hox hoxVar4, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = dmvkVar;
        this.b = activity;
        this.c = fdaeVar;
        this.d = hoxVar;
        this.e = hoxVar2;
        this.f = hoxVar3;
        this.g = hoxVar4;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dmxy) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Display display;
        fctl.b(obj);
        IBinder iBinderB = dmyf.b(this.d);
        final hox hoxVar = this.e;
        final long jA = dmyf.a(hoxVar);
        if (!kjg.e(dmyf.a(hoxVar), 0L) && iBinderB != null) {
            final hox hoxVar2 = this.f;
            if (dmyf.c(hoxVar2) == null) {
                ((ekrd) dmyf.e().h().h("com/google/android/libraries/compose/cameragallery/ui/gallery/embedded/EmbeddedGalleryKt$EmbeddedGallery$3$1", "invokeSuspend", 81, "EmbeddedGallery.kt")).I("Opening photo picker session for %s (host token %s). Opened session was %s.", new kjg(dmyf.a(hoxVar)), iBinderB, dmyf.c(hoxVar2));
                final hox hoxVar3 = this.g;
                if (((Boolean) hoxVar3.a()).booleanValue()) {
                    ((ekrd) dmyf.e().j().h("com/google/android/libraries/compose/cameragallery/ui/gallery/embedded/EmbeddedGalleryKt$EmbeddedGallery$3$1", "invokeSuspend", 90, "EmbeddedGallery.kt")).q("Photo picker session was already opening, awaiting for open completion.");
                } else {
                    dmyf.h(hoxVar3, true);
                    ((ekrd) dmyf.e().h().h("com/google/android/libraries/compose/cameragallery/ui/gallery/embedded/EmbeddedGalleryKt$EmbeddedGallery$3$1", "invokeSuspend", 95, "EmbeddedGallery.kt")).I("Opening photo picker session for %s (host token %s). Opened session was %s.", new kjg(dmyf.a(hoxVar)), iBinderB, dmyf.c(hoxVar2));
                    final dmvk dmvkVar = this.a;
                    Activity activity = this.b;
                    Activity activity2 = Build.VERSION.SDK_INT >= 30 ? activity : null;
                    int displayId = (activity2 == null || (display = activity2.getDisplay()) == null) ? dpgx.d(activity).getDisplayId() : display.getDisplayId();
                    long jA2 = dmyf.a(hoxVar) >> 32;
                    long jA3 = dmyf.a(hoxVar) & 4294967295L;
                    EmbeddedPhotoPickerFeatureInfo.Builder maxSelectionLimit = new EmbeddedPhotoPickerFeatureInfo.Builder().setOrderedSelection(false).setMaxSelectionLimit(10);
                    Iterable iterable = (Iterable) dmvkVar.a.c();
                    ArrayList arrayList = new ArrayList(fcva.p(iterable, 10));
                    Iterator it = iterable.iterator();
                    while (it.hasNext()) {
                        arrayList.add(Uri.parse(((dojv) it.next()).f()));
                    }
                    EmbeddedPhotoPickerFeatureInfo embeddedPhotoPickerFeatureInfoBuild = maxSelectionLimit.setPreSelectedUris(arrayList).setThemeNightMode(32).build();
                    embeddedPhotoPickerFeatureInfoBuild.getClass();
                    dmvkVar.c.openSession(iBinderB, displayId, (int) jA2, (int) jA3, embeddedPhotoPickerFeatureInfoBuild, dmvkVar.d, new dmye(new fdap() { // from class: dmxv
                        @Override // defpackage.fdap
                        public final Object invoke(Object obj2) {
                            EmbeddedPhotoPickerSession embeddedPhotoPickerSessionM13m = aao$$ExternalSyntheticApiModelOutline4.m13m(obj2);
                            ekrd ekrdVar = (ekrd) dmyf.e().h().h("com/google/android/libraries/compose/cameragallery/ui/gallery/embedded/EmbeddedGalleryKt$EmbeddedGallery$3$1", "invokeSuspend$lambda$0", 110, "EmbeddedGallery.kt");
                            hox hoxVar4 = hoxVar2;
                            ekrdVar.D("Opened photo picker session now %s (was %s)", embeddedPhotoPickerSessionM13m, dmyf.c(hoxVar4));
                            dmyf.g(hoxVar4, embeddedPhotoPickerSessionM13m);
                            dmyf.h(hoxVar3, false);
                            long j = jA;
                            hox hoxVar5 = hoxVar;
                            if (!kjg.e(j, dmyf.a(hoxVar5))) {
                                embeddedPhotoPickerSessionM13m.notifyResized((int) (dmyf.a(hoxVar5) >> 32), (int) (dmyf.a(hoxVar5) & 4294967295L));
                            }
                            return fctx.a;
                        }
                    }, dmvkVar.g, new fdap() { // from class: dmxw
                        @Override // defpackage.fdap
                        public final Object invoke(Object obj2) {
                            dmvk dmvkVar2;
                            ArrayList arrayList2 = new ArrayList();
                            Iterator it2 = ((List) obj2).iterator();
                            while (true) {
                                dmvkVar2 = dmvkVar;
                                if (!it2.hasNext()) {
                                    break;
                                }
                                Object next = it2.next();
                                String string = ((Uri) next).toString();
                                string.getClass();
                                Iterable iterable2 = (Iterable) dmvkVar2.a.c();
                                if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                                    Iterator it3 = iterable2.iterator();
                                    while (it3.hasNext()) {
                                        if (fdbq.f(((dojv) it3.next()).f(), string)) {
                                            break;
                                        }
                                    }
                                }
                                arrayList2.add(next);
                            }
                            if (!arrayList2.isEmpty()) {
                                ((ekrd) dmyf.e().h().h("com/google/android/libraries/compose/cameragallery/ui/gallery/embedded/EmbeddedGalleryKt$EmbeddedGallery$3$1", "invokeSuspend$lambda$3", 129, "EmbeddedGallery.kt")).r("User selected %s media", arrayList2.size());
                                dmvkVar2.e.invoke(arrayList2);
                            }
                            return fctx.a;
                        }
                    }, new fdap() { // from class: dmxx
                        @Override // defpackage.fdap
                        public final Object invoke(Object obj2) {
                            dmvkVar.f.invoke((List) obj2);
                            return fctx.a;
                        }
                    }, this.c));
                }
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dmxy(this.a, this.b, this.c, this.d, this.e, this.f, this.g, fcxyVar);
    }
}
