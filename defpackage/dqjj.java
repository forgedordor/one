package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import com.google.mediapipe.framework.AndroidAssetUtil;
import j$.util.DesugarCollections;
import java.io.InputStream;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dqjj extends fcyz implements fdat {
    final /* synthetic */ dqjo a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dqjj(dqjo dqjoVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = dqjoVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dqjj) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        exix exixVar;
        dbgm dbgmVar;
        fctl.b(obj);
        String str = dbgi.a;
        Context context = this.a.a;
        InputStream inputStreamOpen = context.getAssets().open("android_messages_catalog.binaryproto");
        try {
            byte[] bArrB = elec.b(inputStreamOpen);
            if (inputStreamOpen != null) {
                inputStreamOpen.close();
            }
            AndroidAssetUtil.a(context);
            ArrayList arrayList = new ArrayList();
            String str2 = dbgi.a;
            Log.d(str2, "Loading catalog");
            exir exirVar = (exir) evsn.parseFrom(exir.a, bArrB, evrr.a());
            for (exit exitVar : exirVar.b) {
                Log.d(str2, "ES loading category ".concat(String.valueOf(exitVar.b)));
                ArrayList arrayList2 = new ArrayList();
                for (exiv exivVar : exitVar.c) {
                    Log.d(str2, "ES loading effect ".concat(String.valueOf(exivVar.b)));
                    String str3 = exivVar.c;
                    str3.getClass();
                    evub evubVar = exirVar.e;
                    byte[] bArrI = (evubVar.containsKey(str3) ? (evqs) evubVar.get(str3) : null).I();
                    Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrI, 0, bArrI.length);
                    if (DesugarCollections.unmodifiableMap(exirVar.c).isEmpty()) {
                        String str4 = exivVar.b;
                        exix exixVar2 = exix.a;
                        str4.getClass();
                        evub evubVar2 = exirVar.d;
                        exixVar = evubVar2.containsKey(str4) ? (exix) evubVar2.get(str4) : exixVar2;
                    } else {
                        exiw exiwVar = (exiw) exix.a.createBuilder();
                        String str5 = exivVar.b;
                        exjy exjyVar = exjy.a;
                        str5.getClass();
                        evub evubVar3 = exirVar.c;
                        if (evubVar3.containsKey(str5)) {
                            exjyVar = (exjy) evubVar3.get(str5);
                        }
                        exiwVar.copyOnWrite();
                        exix exixVar3 = (exix) exiwVar.instance;
                        exjyVar.getClass();
                        exixVar3.c = exjyVar;
                        exixVar3.b = 1;
                        exixVar = (exix) exiwVar.build();
                    }
                    int i = exixVar.b;
                    int i2 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? 0 : 3 : 2 : 1 : 4;
                    if (i2 == 0) {
                        throw null;
                    }
                    int i3 = i2 - 1;
                    if (i3 == 0) {
                        dbgmVar = new dbgm(exivVar.b, i == 1 ? (exjy) exixVar.c : exjy.a, bitmapDecodeByteArray);
                    } else if (i3 == 1) {
                        String str6 = exivVar.b;
                        if (i == 2) {
                        } else {
                            exjf exjfVar = exjf.a;
                        }
                        dbgmVar = new dbgm(str6, bitmapDecodeByteArray, (byte[]) null);
                    } else if (i3 != 2) {
                        Log.w(str2, "ES loading effect unknown variant ".concat(String.valueOf(exivVar.b)));
                        dbgmVar = null;
                    } else {
                        String str7 = exivVar.b;
                        if (i == 3) {
                        } else {
                            exjd exjdVar = exjd.a;
                        }
                        dbgmVar = new dbgm(str7, bitmapDecodeByteArray);
                    }
                    String str8 = exivVar.d;
                    arrayList2.add(dbgmVar);
                }
                arrayList.add(new dbgj(exitVar.b, arrayList2));
            }
            return arrayList;
        } catch (Throwable th) {
            if (inputStreamOpen == null) {
                throw th;
            }
            try {
                inputStreamOpen.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dqjj(this.a, fcxyVar);
    }
}
