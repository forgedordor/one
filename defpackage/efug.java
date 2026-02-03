package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum efug {
    CONFIG_DEFAULT(efsh.CONFIG_PROGRESS_ILLUSTRATION_DEFAULT),
    CONFIG_ACCOUNT(efsh.CONFIG_PROGRESS_ILLUSTRATION_ACCOUNT),
    CONFIG_CONNECTION(efsh.CONFIG_PROGRESS_ILLUSTRATION_CONNECTION),
    CONFIG_UPDATE(efsh.CONFIG_PROGRESS_ILLUSTRATION_UPDATE);

    efug(efsh efshVar) {
        if (efshVar.bB != 8) {
            throw new IllegalArgumentException("Illustration progress only allow illustration resource");
        }
    }
}
