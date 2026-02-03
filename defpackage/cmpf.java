package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmpf {
    public static cmtu a(ParticipantsTable.BindData bindData) {
        return new cmtu(bindData.T(), bindData.O(), bajp.b(bbax.a(bindData).c));
    }

    public static cmtu b(ParticipantsTable.BindData bindData) {
        if (bindData != null) {
            return a(bindData);
        }
        return null;
    }
}
