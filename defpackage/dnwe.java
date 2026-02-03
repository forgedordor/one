package defpackage;

import android.database.Cursor;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dnwe extends fcyz implements fdau {
    /* synthetic */ Object a;
    final /* synthetic */ dnwk b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dnwe(dnwk dnwkVar, fcxy fcxyVar) {
        super(3, fcxyVar);
        this.b = dnwkVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        dnwe dnweVar = new dnwe(this.b, (fcxy) obj3);
        dnweVar.a = (Cursor) obj2;
        return dnweVar.b(fctx.a);
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [android.database.Cursor, java.lang.Object] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        ?? r7 = this.a;
        fcww fcwwVar = new fcww((byte[]) null);
        while (r7 != 0 && r7.moveToNext()) {
            try {
                fcwwVar.add(dnwk.d(r7));
            } catch (Exception e) {
                ((ekrd) ((ekrd) dnwk.a.i()).g(e).h("com/google/android/libraries/compose/emotify/data/content/EmotifyDataService$getCustomStickers$2$1$1", "invokeSuspend", 62, "EmotifyDataService.kt")).q("Unable to parse sticker, skipping");
            }
        }
        return fcva.a(fcwwVar);
    }
}
