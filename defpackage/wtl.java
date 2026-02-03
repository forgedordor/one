package defpackage;

import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class wtl extends fdbb implements fdat {
    public static final wtl a = new wtl();

    public wtl() {
        super(2, bpcv.class, "setText", "setText(Ljava/lang/String;)Lcom/google/android/apps/messaging/shared/datamodel/databasegen/tabledefinitions/DraftsTable$UpdateBuilder;", 8);
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        bpcv bpcvVar = (bpcv) obj;
        bpcvVar.getClass();
        dqru.v(bpcvVar.a, ConversationSuggestion.SUGGESTION_PROPERTY_TEXT, (String) obj2);
        return fctx.a;
    }
}
