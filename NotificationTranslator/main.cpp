#include <QGuiApplication>
#include <QtQuick>

int main(int argc, char *argv[])
{
    QGuiApplication::setApplicationName("NotificationTranslator");
    QGuiApplication::setOrganizationName("TDevelopers");
    QGuiApplication::setAttribute(Qt::AA_EnableHighDpiScaling);

    QGuiApplication app(argc, argv);
    QQmlApplicationEngine engine;
    engine.load(QUrl("qrc:/main.qml"));
    if (engine.rootObjects().isEmpty())
        return -1;

    return app.exec();
}
