package defpackage;

import android.graphics.Bitmap;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ejfi extends fcyz implements fdat {
    int a;
    final /* synthetic */ ejfj b;
    final /* synthetic */ Bitmap c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ejfi(ejfj ejfjVar, Bitmap bitmap, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = ejfjVar;
        this.c = bitmap;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ejfi) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        try {
            if (this.a != 0) {
                fctl.b(obj);
            } else {
                fctl.b(obj);
                ejfh ejfhVar = new ejfh(this.b, this.c, null);
                this.a = 1;
                obj = fdna.a(10000L, ejfhVar, this);
                if (obj == fcylVar) {
                    return fcylVar;
                }
            }
        } catch (ejgb e) {
            ejfj ejfjVar = this.b;
            abvd abvdVar = ejfjVar.x;
            if (abvdVar != null) {
                abvdVar.b(dnwz.g);
            }
            ((ekrd) ((ekrd) ejfjVar.e.i()).g(e).h("com/google/chat/smartmessaging/penpal/ui/EmotifyViewModel$segmentImage$1", "invokeSuspend", 267, "EmotifyViewModel.kt")).q("Error setting up segmenter or segmenting image");
            ejfjVar.a(e.a);
        } catch (fdmx e2) {
            ejfj ejfjVar2 = this.b;
            abvd abvdVar2 = ejfjVar2.x;
            if (abvdVar2 != null) {
                abvdVar2.b(dnwz.d);
            }
            ((ekrd) ((ekrd) ejfjVar2.e.i()).g(e2).h("com/google/chat/smartmessaging/penpal/ui/EmotifyViewModel$segmentImage$1", "invokeSuspend", 271, "EmotifyViewModel.kt")).q("Timed out segmenting image");
            ejfjVar2.a(ejga.b);
        } catch (OutOfMemoryError e3) {
            ejfj ejfjVar3 = this.b;
            abvd abvdVar3 = ejfjVar3.x;
            if (abvdVar3 != null) {
                abvdVar3.b(dnwz.e);
            }
            ((ekrd) ((ekrd) ejfjVar3.e.i()).g(e3).h("com/google/chat/smartmessaging/penpal/ui/EmotifyViewModel$segmentImage$1", "invokeSuspend", 276, "EmotifyViewModel.kt")).q("Running out of memory while segmenting");
            ejfjVar3.a(ejga.c);
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ejfi(this.b, this.c, fcxyVar);
    }
}
