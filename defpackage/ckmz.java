package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckmz {
    public static final ekrz a;
    public static final ekrz b;
    public static final ekrz c;
    public static final ekrz d;
    public static final ekrz e;
    public static final ekrz f;
    public static final ekrz g;
    public static final ekrz h;
    public static final ekrz i;
    public static final ekrz j;
    public static final ekrz k;

    static {
        new ekrz("reaction_message_id", String.class, false, false);
        a = new ekrz("reaction_message_id", MessageIdType.class, false, false);
        new ekrz("reaction_rcs_message_id", String.class, false, false);
        b = new cqno("reaction_rcs_message_id", basd.class);
        c = new ekrz("reacted_message_id", String.class, false, false);
        d = new ekrz("reacted_message_id", MessageIdType.class, false, false);
        new ekrz("reacted_rcs_message_id", String.class, false, false);
        e = new cqno("reacted_rcs_message_id", basd.class);
        f = new ekrz("reaction_surface_type", emqr.class, false, false);
        g = new ekrz("reaction_action", ckmc.class, false, false);
        h = new ekrz("is_reaction_unspecified", Boolean.class, false, false);
        new ekrz("message_status", String.class, false, false);
        new ekrz("message_is_rcs", Boolean.class, false, false);
        new ekrz("message_can_reply", Boolean.class, false, false);
        new ekrz("rcs_sending_available", Boolean.class, false, false);
        new ekrz("has_text", Boolean.class, false, false);
        new ekrz("transport_selection_status", ckyf.class, false, false);
        new ekrz("reactions_transport_type", ckyd.class, false, false);
        i = new ekrz("match_count", Integer.class, false, false);
        j = new ekrz("content_uri", String.class, false, false);
        k = new ekrz("emotify_id", String.class, false, false);
    }
}
