package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cruh {
    public static final crui a(boolean z, ConversationIdType conversationIdType, String str, csdl csdlVar, boolean z2, boolean z3, elka elkaVar, cryl crylVar, eofr eofrVar, int i, int i2, int i3) {
        csdlVar.getClass();
        elkaVar.getClass();
        if (i3 != 0) {
            return new crui(z, conversationIdType, str, csdlVar, z2, z3, elkaVar, crylVar, eofrVar, i, i2, i3, false, null, null);
        }
        throw null;
    }

    public static /* synthetic */ crui b(boolean z, ConversationIdType conversationIdType, String str, csdl csdlVar, boolean z2, boolean z3, elka elkaVar, cryl crylVar, eofr eofrVar, int i, int i2, int i3, int i4) {
        cryl crylVar2;
        boolean z4;
        ConversationIdType conversationIdType2;
        elka elkaVar2;
        eofr eofrVar2;
        int i5;
        int i6;
        int i7;
        boolean z5;
        csdl csdlVar2 = (i4 & 32) != 0 ? csdl.b : csdlVar;
        int i8 = i4 & 2;
        String str2 = (i4 & 8) != 0 ? null : str;
        if (i8 != 0) {
            conversationIdType = null;
        }
        boolean z6 = (!((i4 & 64) == 0)) | z2;
        boolean z7 = (!((i4 & 128) == 0)) | z3;
        if ((i4 & 512) != 0) {
            crylVar2 = null;
            z4 = z;
            elkaVar2 = elkaVar;
            eofrVar2 = eofrVar;
            i5 = i;
            i6 = i2;
            i7 = i3;
            z5 = z6;
            conversationIdType2 = conversationIdType;
        } else {
            crylVar2 = crylVar;
            z4 = z;
            conversationIdType2 = conversationIdType;
            elkaVar2 = elkaVar;
            eofrVar2 = eofrVar;
            i5 = i;
            i6 = i2;
            i7 = i3;
            z5 = z6;
        }
        return a(z4, conversationIdType2, str2, csdlVar2, z5, z7, elkaVar2, crylVar2, eofrVar2, i5, i6, i7);
    }
}
