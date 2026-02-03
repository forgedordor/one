package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class dozc extends fdbb implements fdat {
    public dozc(Object obj) {
        super(2, obj, dobf.class, "fromString", "fromString(Ljava/lang/String;)Lcom/google/android/libraries/compose/gifsticker/data/usage/GifStickerRecord$StickerRecord;", 4);
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        doas doasVar;
        String str = (String) obj;
        str.getClass();
        List listS = fdgn.S(str, new String[]{"|"}, 0, 6);
        if (listS.size() != 2) {
            listS = null;
        }
        if (listS == null) {
            throw new IllegalStateException("Unable to parse sticker record ".concat(str));
        }
        String str2 = (String) listS.get(0);
        String str3 = (String) listS.get(1);
        str2.getClass();
        if (fdbq.f(str2, "STICKER_API")) {
            doasVar = doys.a;
        } else {
            if (!fdbq.f(str2, "TENOR")) {
                throw new IllegalArgumentException("Invalid GIF/Sticker media source ".concat(str2));
            }
            doasVar = doar.a;
        }
        return new dobg(str3, doasVar);
    }
}
