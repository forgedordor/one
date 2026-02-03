package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vzy {
    public static final vzy a;
    public static final vzy b;
    public static final vzy c;
    public static final vzy d;
    private static final /* synthetic */ vzy[] e;

    static {
        vzy vzyVar = new vzy("PROCESSING_ATTACHMENTS", 0);
        a = vzyVar;
        vzy vzyVar2 = new vzy("EDIT_MESSAGE_TEXT_NOT_CHANGED", 1);
        b = vzyVar2;
        vzy vzyVar3 = new vzy("NO_SENDABLE_DRAFT_CONTENTS", 2);
        c = vzyVar3;
        vzy vzyVar4 = new vzy("LONGER_THAN_MAX_MESSAGE_SIZE", 3);
        d = vzyVar4;
        vzy[] vzyVarArr = {vzyVar, vzyVar2, vzyVar3, vzyVar4};
        e = vzyVarArr;
        fczb.a(vzyVarArr);
    }

    private vzy(String str, int i) {
    }

    public static vzy[] values() {
        return (vzy[]) e.clone();
    }
}
